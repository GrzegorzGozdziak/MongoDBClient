package pl.sda.mongo;

import com.mongodb.DBObject;
import org.bson.types.ObjectId;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PostsDAO dao = new PostsDAO();

//        Post post = new Post();
//        post.setAuthor("Gregory");
//        post.setContent("testowy content");
//        post.setDate(new Date());
//        dao.insert(post);

//        List<DBObject> result = dao.searchById(new ObjectId("58c0508468b1761598a19e70"));
//        System.out.println(result.toString());

//        DBObject dbObject = dao.removeById(new ObjectId("58c03c71b51ea5a0bf14f685"));
//        System.out.println(dbObject);

        Post post2update = new Post();
        post2update.setAuthor("Gregoryyyy");
        post2update.setContent("testowy content AKTUALIZACJA");
        post2update.setDate(new Date());

        dao.update(post2update, new ObjectId("58c03c80b51ea5a0bf14f687"));


    }
}
