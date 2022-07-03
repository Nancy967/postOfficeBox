package box;

public class BoxThreeO extends BoxNumber{
    public BoxThreeO(float length, float width, float height) {
        super(length, width, height);
    }

    @Override
    public boolean validate() {
        if (length < 23 && width < 14 && height < 13){
            return true;
        }else {
            return false;
        }
    }
}
