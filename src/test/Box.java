package test;

class Box<T> {
    private T value;

    //값을 설정하는 메서드
    public void setValue(T value) {
        this.value = value;
    }

    //값을 가져오는 메서드
    public T getValue() {
        return value;
    }
}
