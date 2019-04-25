package com.xiaolinzi.demodatajpa.repository;

        import com.xiaolinzi.demodatajpa.entity.Post;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}
