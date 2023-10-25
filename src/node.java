public class node {
    Integer dataNode;
    node pointer;

    public node() {
        dataNode = null;
        pointer = null;
    }
    //tambahin pointer = node p untuk fix error
    public node(Integer d){
        dataNode = d;
        pointer = null;
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


