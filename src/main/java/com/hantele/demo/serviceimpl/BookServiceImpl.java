package com.hantele.demo.serviceimpl;

import com.hantele.demo.dao.BookcountMapper;
import com.hantele.demo.dao.BookindMapper;
import com.hantele.demo.dao.BooksMapper;
import com.hantele.demo.entity.Bookcount;
import com.hantele.demo.entity.Books;
import com.hantele.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BooksMapper booksMapper;
    @Autowired
    private BookcountMapper bookcountMapper;
    @Autowired
    private BookindMapper bookindMapper;

    @Override
    public List<Books> selectBookByCondition(String condition) {
        return booksMapper.selectBookByCondition(condition);
    }

    @Override
    public void addBook(Books books) {
        if (booksMapper.insertBooks(books)==1) {
            if(booksMapper.selectBookcountByBookName(books.getbookName())==null) {
                bookcountMapper.insert(new Bookcount(null,books.getbookName(),0));
            }
            bookcountMapper.IncreaseBookCount(books.getbookName(),1);
            bookindMapper.IncreaseBookListCount(books.getbookList_ID(),1);
        }
//        System.out.println(booksMapper.selectBookcountByBookName("123"));
    }

    @Override
    public void deleteBook(String ids) {
        String[] arr_ids=ids.split(",");
        Books books = new Books();
        for(int i = 0;i<arr_ids.length;i++) {
            int id = Integer.parseInt(arr_ids[i]);
            books = booksMapper.selectByPrimaryKey(id);
            booksMapper.deleteBook(id);
            System.out.println(books.getbookName());
            System.out.println(books.getbookList_ID());
            bookcountMapper.DecreaseBookCount(books.getbookName(),1);
            bookindMapper.DecreaseBookListCount(books.getbookList_ID(),1);
        }
    }
}
