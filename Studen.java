package ra.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Studen implements IEntity{
    private String studentId;
    private String studentName;
    private Date birthday;
    private int age;
    private Boolean sex;
    private float mark_html;
    private float mark_css;
    private float mark_javascript;

    public Studen() {
    }

    public Studen(String studentId, String studentName, Date birthday, int age, Boolean sex, float mark_html, float mark_css, float mark_javascript) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.birthday = birthday;
        this.age = age;
        this.sex = sex;
        this.mark_html = mark_html;
        this.mark_css = mark_css;
        this.mark_javascript = mark_javascript;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public float getMark_html() {
        return mark_html;
    }

    public void setMark_html(float mark_html) {
        this.mark_html = mark_html;
    }

    public float getMark_css() {
        return mark_css;
    }

    public void setMark_css(float mark_css) {
        this.mark_css = mark_css;
    }

    public float getMark_javascript() {
        return mark_javascript;
    }

    public void setMark_javascript(float mark_javascript) {
        this.mark_javascript = mark_javascript;
    }

    @Override
    public <T> void inputData(Scanner scanner, List<T> list) {
        Boolean isExit = true;
        System.out.println("Nhập thông tin sinh viên");
        System.out.println("Nhập ID cho sinh viên");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập Tên sinh viên");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập ngày sinh ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String inputDate = scanner.nextLine();
        try {
            this.birthday = sdf.parse(inputDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Nhập giới tính");
        do {
            String inputSex = scanner.nextLine();
            if (!inputSex.equalsIgnoreCase("true")&&!inputSex.equalsIgnoreCase("false")){
                System.out.println("Vui lòng nhập lại, chỉ nhập true or false");
            }else {
                this.sex = Boolean.parseBoolean(inputSex);
                break;
            }
        }while (isExit);
        System.out.println("Nhập điểm HTML");
        do {
            try {
                this.mark_html = Float.parseFloat(scanner.nextLine());
                if (this.mark_html<0 || this.mark_html>10){
                    System.out.println("Điểm chỉ có thể từ 0 - 10. Nhập lại");
                }else {
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập một số");
            }
        }while (isExit);
        System.out.println("Nhập điểm CSS");
        do {
            try {
                this.mark_css = Float.parseFloat(scanner.nextLine());
                if (this.mark_css<0 || this.mark_css>10){
                    System.out.println("Điểm chỉ có thể từ 0 - 10. Nhập lại");
                }else {
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập một số");
            }
        }while (isExit);
        System.out.println("Nhập điểm Javascrip");
        do {
            try {
                this.mark_javascript = Float.parseFloat(scanner.nextLine());
                if (this.mark_javascript<0 || this.mark_javascript>10){
                    System.out.println("Điểm chỉ có thể từ 0 - 10. Nhập lại");
                }else {
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập một số");
            }
        }while (isExit);
    }

    @Override
    public void displayData() {

    }

    @Override
    public void calAge() {

    }

    @Override
    public void calAvgMark_Rank() {

    }
}
