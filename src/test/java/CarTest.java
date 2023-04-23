import org.example.Car;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarTest {

    private Car car1;
    private Car car2;
    private Car car3;

    @BeforeMethod
    public void setUp() {
        car1 = new Car(18000,11950,false,450,true);
        car2 = new Car(18000,12560,false,160,false);
        car3 = new Car(18000,12560,false,100,true);
    }

    @Test
    public void checkMileageTest(){
        Assert.assertEquals(car1.checkMileage(),true);
        Assert.assertEquals(car2.checkMileage(),false);
        Assert.assertEquals(car3.checkMileage(),false);
    }

    @Test
    public void checkBreakTmp(){
        Assert.assertEquals(car1.checkBreakTmp(),"Overheated");
        Assert.assertEquals(car2.checkBreakTmp(),"Be attentive");
        Assert.assertEquals(car3.checkBreakTmp(),"OK");
    }

    @Test
    public void lightSwitch(){
        car1.lightSwitch();
        car2.lightSwitch();
        car3.lightSwitch();
        Assert.assertEquals(car1.isLightSwitch(),true);
        Assert.assertEquals(car2.isLightSwitch(),true);
        Assert.assertEquals(car3.isLightSwitch(),true);
    }
    @Test
    public void modeChange(){
        car1.changeMode("Eco");
        car2.changeMode("Comfort");
        car3.changeMode("Sport");
        Assert.assertEquals(car1.isModeEco(),true);
        Assert.assertEquals(car2.isModeComfort(),true);
        Assert.assertEquals(car3.isModeSport(),true);
        car3.changeMode("Jungle");
        Assert.assertEquals(car3.isModeEco(),true);
    }



}
