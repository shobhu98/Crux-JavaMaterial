package Lecture_20;

import java.util.LinkedList;

public class EdgeListGraph<T> {
    private LinkedList<Vertex>  vertices;
    private LinkedList<Edges> edges;
    private class Vertex{
        private  T value;
        public Vertex (T value){
            this.value=value;

        }
    }
    private class Edges{
        private T start;
        private T end;
        public Edges(T start,T end){
            this.start=start;
            this.end=end;

        }

    }
    public void AddVertex(T value){
        vertices.add(new Vertex(value));
    }
    public  void  addEdge(T start,T end){
        if(exists(start)&&exists(end)){
            edges.add(new Edges(start,end));
        }
    }

    private boolean exists(T value){
        for(Vertex v:vertices){
            if(v.value.equals(value)){
                return true;
            }
        }
        return false;
    }


}
