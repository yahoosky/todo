/**
 * @description
 */
package late.todo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import late.todo.entity.TodoMastEntity;

/**
 * 
 * @projectName todo
 * @packageName late.todo.repo
 * @fileName TodoMastReposity.java
 * @author chijingjia
 * @createTime :2018年10月6日 下午8:44:25
 * @version: v1.0
 */
public interface ITodoMastRepository extends MongoRepository<TodoMastEntity, String>, QuerydslPredicateExecutor<TodoMastEntity> {

}
