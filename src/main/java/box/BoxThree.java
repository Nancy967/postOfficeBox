package box;

public class BoxThree {
    float length;
    float width;
    float height;

    public BoxThree(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate() {
        if (length < 23 && width < 14 && height < 13){
            return true;
        }else {
            return false;
        }
    }
}
