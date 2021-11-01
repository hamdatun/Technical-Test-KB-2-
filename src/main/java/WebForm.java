import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String FIRST_NAME = "First Name";
    private final String LAST_NAME = "Last Name";

//    @FindBy(xpath = "(//span[@class='cardStyle__CardTitle-sc-1rj3uct-0 edQICK'])[1]")
//    private WebElement campaign;

    @FindBy(id = "campaign-detail_button_donasi-sekarang")
    private WebElement Klik_donasi;

    @FindBy(xpath = "(//label[@class='nominalText'])[1]")
    private WebElement Nominal_10000;

    @FindBy(xpath = "//span[contains(text(), 'Transfer BCA')]")
    private WebElement Pilih_PaymentMethod;

    @FindBy(xpath = "(//input[@data-testid=\"textFieldInput\"])[1]")
    private WebElement Input_NamaLengkap;

    @FindBy(xpath = "(//input[@data-testid=\"textFieldInput\"])[2]")
    private WebElement Input_NomorHP_Email;

    @FindBy(id = "contribute_button_lanjutkan-pembayaran")
    private WebElement Lanjut_Pembayaran;

    @FindBy(xpath = "//img[@class='style__ArrowImg-sc-1qhccvk-3 fxwXJG']")
    private WebElement back_to_campaign;

    public WebForm(WebDriver driver) {
        super(driver);
    }

//    public void ClickCampaign(){
//        this.campaign.click();
//    }

    public void ClickDonasi(){
        this.Klik_donasi.click();
    }

    public void ClickNominal(){
        this.Nominal_10000.click();
    }

    public void ClickPaymentMethod(){
        this.Pilih_PaymentMethod.click();
    }

    public void enterNamaLengkap(){
        this.Input_NamaLengkap.sendKeys("Hamdatun");
    }

    public void enterEmail(){
        this.Input_NomorHP_Email.sendKeys("hamdatunnupus@gmail.com");
    }

    public void ClickBayar(){this.Lanjut_Pembayaran.click();}

    public void KembaliKeDonasi(){this.back_to_campaign.click();}
}