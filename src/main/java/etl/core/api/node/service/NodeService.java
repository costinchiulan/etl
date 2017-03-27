package etl.core.api.node.service;

import etl.core.api.node.model.Node;
import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service
@Component
public class NodeService {

    public List<Node> getAllNodes() {
        return Arrays.asList(
                new Node(1, "Node1"),
                new Node(2, "Node2"),
                new Node(3, "Node3"),
                new Node(4, "Node4")
        );
    }
}
