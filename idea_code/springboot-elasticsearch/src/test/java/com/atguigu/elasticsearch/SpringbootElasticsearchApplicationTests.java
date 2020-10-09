package com.atguigu.elasticsearch;

import com.atguigu.elasticsearch.bean.Book;
import com.atguigu.elasticsearch.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootElasticsearchApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void test02(){
		Book book = new Book();
//		book.setId(1);
//		book.setBookName("西游记");
//		book.setAuthor("吴承恩");
		bookRepository.index(book);

//        for (Book book : bookRepository.findByBookNameLike("游")) {
//            System.out.println(book);
//        }
        ;

    }


    @Test
    void contextLoads() {
    }

}
