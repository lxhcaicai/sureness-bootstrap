package com.github.sureness.matcher.util;

import java.util.*;

public class TirePathTree {

    private static final String NODE_TYPE_PATH_NODE = "pathNode";
    private static final String NODE_TYPE_METHOD = "methodNode";


    private static class Node {

        private String nodeType;

        private String data;

        private Map<String,Node> children;

        private List<String> patternChildren;

        private Map<String,Node> methodChildren;

        public Node(String data,String nodeType) {
            this.nodeType = nodeType;
            this.data = data;
            this.children = new HashMap<>();
        }

        public Node(String data) {
            this.data = data;
            this.children = new HashMap<>();
            this.nodeType = NODE_TYPE_PATH_NODE;
        }

        private void insertChild(String data) {
            this.children.put(data, new Node(data));
        }

        private void insertChild(String data,String nodeType) {
            this.children.put(data, new Node(data, nodeType));
        }

        private void insertPatternChild(String data) {
            if (patternChildren == null) {
                patternChildren = new LinkedList<>();
            }
            this.patternChildren.add(data);
        }

        public Node getMethodChild(String method) {
            return methodChildren == null ? null : methodChildren.get(method);
        }

        public Map<String,Node> getMethodChildren() {
            return methodChildren;
        }

        public Node insertMethodChildren(String method) {
            if (methodChildren == null) {
                methodChildren = new HashMap<>(8);
            }
            Node node = new Node(method, NODE_TYPE_METHOD);
            methodChildren.put(method, node);
            return node;
        }

        private String getNodeType() {
            return nodeType;
        }

        private void setNodeType(String nodeType) {
            this.nodeType = nodeType;
        }

        private String getData() {
            return data;
        }

        private Map<String, Node> getChildren() {
            return children;
        }

        public List<String> getPatternChildren() {
            return patternChildren;
        }
    }
}
