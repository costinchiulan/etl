package etl.core.api.node.controller;

import etl.core.api.node.model.Node;
import etl.core.api.node.repository.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NodeController {

    @Autowired
    private NodeRepository nodeRepository;

    @RequestMapping(path = "/nodes")
    public List<Node> getAllNodes() {
        List<Node> nodes = new ArrayList<>();
        nodeRepository.findAll()
                      .forEach(nodes::add);
        return nodes;
    }
    @RequestMapping(path = "/nodes/{id}")
    public Node getNodeById(@PathVariable Integer id) {
        return nodeRepository.findByid(id);
    }

    @RequestMapping(path = "/nodes/{name}")
    public Node getNodeByName(@PathVariable String name) {
        return nodeRepository.findByName(name);
    }

}
