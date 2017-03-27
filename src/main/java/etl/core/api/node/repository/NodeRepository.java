package etl.core.api.node.repository;

import etl.core.api.node.model.Node;
import org.springframework.data.repository.CrudRepository;




public interface NodeRepository extends CrudRepository<Node, Integer>{
    Node findByid(Integer id);
    Node findByName(String name);
}
