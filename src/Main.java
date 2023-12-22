import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password,select;

        Scanner input= new Scanner(System.in);
        System.out.println("Kullanıcı Adınızı Giriniz : ");
        userName=input.nextLine();
        System.out.println("Şifrenizi Giriniz : ");
        password=input.nextLine();

        if (userName.equals("Merve") && password.equals("Merve123")){
            System.out.println("Başarılı Bir Şekilde Giriş Sağladınız");
        }
        else {
            System.out.println("Bilgileriniz Eşleşmemekte Şifrenizi Sıfırlamak İster Misiniz?\nE-Evet\nH-Hayır" );

            String response=input.nextLine();

            if (response.equals("E")){
                System.out.println("Yeni şifre bilginizi giriniz");
                String newPassword=input.nextLine();

                if (newPassword.equals("Merve123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    System.out.println("Şifre Oluşturuldu");
                }
                }
                }
        }
    }

