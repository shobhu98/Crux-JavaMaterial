package Lecture_20;

import java.util.LinkedList;



import java.util.*;

public class AdjListGraph<T> {

    private final LinkedList<Vertex> vertices;

    public AdjListGraph(){
        vertices = new LinkedList<>();
    }

    public class Vertex{
        private T value;
        private LinkedList<Vertex> neighbours;

        public Vertex(T value){
            this.value = value;
            neighbours = new LinkedList<>();
        }
    }

    public void addEdge(T start,T end){
        Vertex s_v = find(start);
        Vertex e_v = find(end);
        if(s_v!=null && e_v!=null){
            s_v.neighbours.add(e_v);
            e_v.neighbours.add(s_v);
        }
    }

    public void addVertex(T value){
        vertices.add(new Vertex(value));
    }

    private Vertex find (T value){
        for (Vertex v:vertices) {
            if (v.value.equals(value)) {
                return v;
            }
        }
        return null;
    }

    private boolean exists(T value){
        for (Vertex v:vertices) {
            if(v.value.equals(value)){
                return true;
            }
        }
        return false;
    }

    public void depth_first_travesal(){
        if(vertices.isEmpty()){
            return;
        }
        Stack<Vertex> stack = new Stack<>();
        Set <Vertex> visited = new HashSet<>();

        Vertex current = vertices.get(0);
        stack.push(current);
        visited.add(current);

        while (!stack.isEmpty()){
            Vertex top = stack.pop();

            System.out.println(top.value);

            for (Vertex v:top.neighbours) {
                if(!visited.contains(v)){
                    stack.push(v);
                    visited.add(v);
                }

            }
        }
    }
/*
    public void breadth_first_traversal(){
        if(vertices.isEmpty()){
            return;
        }
        Queue<Vertex> buffer = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        Vertex current =vertices.get(0);
        buffer.insert_to_rear(current);
        visited.insert_to_rear(current);

        while (!buffer.isEmpty()){
            Vertex top = buffer.remove()
        }
    }*/
}