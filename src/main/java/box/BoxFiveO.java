package box;

public class BoxFiveO extends BoxNumber{
    public BoxFiveO(float length, float width, float height) {
        super(length, width, height);
    }

    @Override
    public boolean validate() {
        if (length < 39.5 && width < 27.5 && height < 23){
            return true;
        }else {
            return false;
        }
    }
}
