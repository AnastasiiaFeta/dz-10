import javax.annotation.processing.Processor;
import java.util.Currency;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        Processor bankApp;
        try {
            bankApplication.process("accountId001", 50, String.valueOf(Currency.getInstance("USD")));
        } catch (exceptions.WrongAccountException e) {
            System.out.println("Такого акаунту не існує");
        } catch (exceptions.WrongCurrencyException e) {
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (exceptions.WrongOperationException e) {
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }

        try {
            bankApplication.process("accountId001", 50, String.valueOf(Currency.getInstance("USD")));
        } catch (exceptions.WrongAccountException e) {
            System.out.println("Такого акаунту не існує");
        } catch (exceptions.WrongCurrencyException e) {
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (exceptions.WrongOperationException e) {
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
            {
            }
        }
    }
}


