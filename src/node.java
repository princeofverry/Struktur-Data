public class node {
    Integer dataNode;
    node pointer;

    public node() {
        dataNode = null;
        pointer = null;
    }

    public node(Integer d, node p){
        dataNode = d;
        pointer = p;
    }

    public int getData(){
        return dataNode;
    }

    public void setDataNode(Integer d){
        dataNode = d;
    }

    public node getPointer(){
        return pointer;
    }

    public void setPointer(node p){
        pointer = p;
    }

}


