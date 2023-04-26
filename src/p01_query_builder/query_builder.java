package p01_query_builder;

public class query_builder {
    public String SELECT;
    public String FROM;
    public String WHERE;

    StringBuffer st1 = new StringBuffer();

    public query_builder select(String record){
        this.SELECT=record;
        st1.append("SELECT ").append(record);
        return this;
    }
    public query_builder from(String table){
        this.FROM=table;
        st1.append("\tFROM ").append(table);
        return this;
    }
    public query_builder where(String condition){
        this.WHERE=condition;
        st1.append("\tWHERE ").append(condition);
        return this;
    }
    public void print(){
        System.out.println(st1);
    }
}
