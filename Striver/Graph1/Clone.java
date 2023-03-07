package Striver.Graph1;

import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Node;

public class Clone {
    public Node cloneGraph(Node node) {
        HashMap<Integer, Node> map = new HashMap<>();
        return clone(node, map);
    }

    public Node clone(Node node, HashMap<Integer, Node> map){
        if(node == null) {
            return null;
        }

        if(map.containsKey(node.val)){
             return map.get(node.val);
        }

        Node newNode = new Node(node.val, new ArrayList<Node>());
        map.put(newNode.val, newNode);
        for(Node neighbor : node.neighbors){
            newNode.neighbors.add(clone(neighbor, map));
        }
        return newNode;
    }
}
