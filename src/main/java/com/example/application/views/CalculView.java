package com.example.application.views;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;

/**
 * A Designer generated component for the calcul-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("calcul-view")
@Route(value = "", layout = MainLayout.class)
@JsModule("./views/calcul-view.ts")
public class CalculView extends LitTemplate {

    @Id("ecran")
    private Label ecran;
    @Id("ch7")
    private Button ch7;
    @Id("ch8")
    private Button ch8;
    @Id("ch9")
    private Button ch9;
    @Id("clear")
    private Button clear;
    @Id("ch4")
    private Button ch4;
    @Id("ch5")
    private Button ch5;
    @Id("mul")
    private Button mul;
    @Id("ch1")
    private Button ch1;
    @Id("ch2")
    private Button ch2;
    @Id("ch3")
    private Button ch3;
    @Id("div")
    private Button div;
    @Id("ch0")
    private Button ch0;
    @Id("egal")
    private Button egal;
    @Id("add")
    private Button add;
    @Id("moins")
    private Button moins;
    @Id("racine")
    private Button racine;
    @Id("pow")
    private Button pow;
    @Id("abs")
    private Button abs;
    @Id("inverse")
    private Button inverse;
    @Id("cos")
    private Button cos;
    @Id("sin")
    private Button sin;
    @Id("tan")
    private Button tan;
    @Id("ch6")
    private Button ch6;

    private String name;
    private  List<String> ls=new ArrayList<String>();
    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;
    @Id("pow1")
    private Button pow1;
    @Id("extendedChk")
    private Checkbox extendedChk;
    private String number;
    private String number1;
    @Id("extendedLayout")
    private HorizontalLayout extendedLayout;

    /**
     * Creates a new CalculView.
     */
    public CalculView() {
        // You can initialise any data required for the connected UI components here.

        List<Button> chiffres= List.of(ch0,ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9);
        for (int i=0;i<chiffres.size();i++)
            prepare(chiffres,i);



        extendedChk.addValueChangeListener(this::onCheckChanged);

        add.addClickListener(event->{this.name="add";});
        add.addClickListener(this::operation);
        div.addClickListener(event->{this.name="div";});
        div.addClickListener(this::operation);
        mul.addClickListener(event->{this.name="mul";});
        mul.addClickListener(this::operation);
        moins.addClickListener(event->{this.name="moins";});
        moins.addClickListener(this::operation);

        cos.addClickListener(this::cosinus);
        sin.addClickListener(this::sinus);
        tan.addClickListener(this::tangent);
        egal.addClickListener(this::egal);
        clear.addClickListener(buttonClickEvent -> clear());
        inverse.addClickListener(this::Inverse);
        pow.addClickListener(event->{this.name="pow";});
        pow.addClickListener(this::operation);
        pow1.addClickListener(event->{this.name="pow1";});
        pow1.addClickListener(this::egal);
        racine.addClickListener(event->{this.name="racine";});
        racine.addClickListener(this::egal);
        abs.addClickListener(event->{this.name="abs";});
        abs.addClickListener(this::egal);
    }

    private void operation(ClickEvent<Button> e) {

        this.number=ecran.getText();

        ls.add(number);


        clear1();
    }

    private void Inverse(ClickEvent<Button> e) {
        String inv;
        double res;
        int a = 1;
        inv = ecran.getText();
        res=a / (Double.parseDouble(inv));
        Notification.show(String.valueOf(a));
        ecran.setText(String.valueOf(res));


    }

    private void cosinus(ClickEvent<Button> e) {
        int c ;

        c =Integer.parseInt(ecran.getText());
        clear();
        ecran.setText(String.valueOf(Math.cos(c)));
    }
    private void sinus(ClickEvent<Button> e) {
        int c ;

        c =Integer.parseInt(ecran.getText());
        clear();
        ecran.setText(String.valueOf(Math.sin(c)));
    }
    private void tangent(ClickEvent<Button> e) {
        int c ;

        c =Integer.parseInt(ecran.getText());
        clear();
        ecran.setText(String.valueOf(Math.tan(c)));
    }
    private void egal(ClickEvent<Button> e) {
        double div;
        int res = 0;
        double ra;
        int mul = 1;
        if (this.name == "add") {

            this.number1 = ecran.getText();
            for (int i = 0; i < ls.size(); i++) {

                res = res + Integer.parseInt(ls.get(i));
            }
            res = res + Integer.parseInt(number1);
            ecran.setText(String.valueOf(res));
            ls.clear();
        } else if (this.name == "mul") {

            this.number1 = ecran.getText();
            for (int i = 0; i < ls.size(); i++) {

                mul = mul * Integer.parseInt(ls.get(i));
            }
            mul = mul * Integer.parseInt(number1);
            ecran.setText(String.valueOf(mul));
            ls.clear();
        } else if (this.name == "div") {

            this.number1 = ecran.getText();
            div = Integer.parseInt(ls.get(0));
            for (int i = 1; i < ls.size(); i++) {

                div = div / Integer.parseInt(ls.get(i));
            }
            div = div / Integer.parseInt(number1);
            ecran.setText(String.valueOf(div));
            ls.clear();
        } else if (this.name == "moins") {

            this.number1 = ecran.getText();
            res = Integer.parseInt(ls.get(0));
            for (int i = 1; i < ls.size(); i++) {

                res = res - Integer.parseInt(ls.get(i));
            }
            res = res - Integer.parseInt(number1);
            ecran.setText(String.valueOf(res));
            ls.clear();
        }
        else if (this.name == "pow1") {

            this.number1 = ecran.getText();

            res = (int) Math.pow(Integer.parseInt(this.number1),2);
            ecran.setText(String.valueOf(res));

        }
        else if (this.name == "pow") {

            this.number1 = ecran.getText();


            res = (int) Math.pow(Integer.parseInt(ls.get(0)),Integer.parseInt(this.number1));
            ecran.setText(String.valueOf(res));

        }
        else if (this.name == "racine") {

            this.number1 = ecran.getText();


            ra =  Math.sqrt(Integer.parseInt(this.number1));
            ecran.setText(String.valueOf(ra));

        }
        else if (this.name == "abs") {

            this.number1 = ecran.getText();


            res =  Math.abs(Integer.parseInt(this.number1));
            ecran.setText(String.valueOf(res));

        }
    }


    private void onCheckChanged(AbstractField.ComponentValueChangeEvent<Checkbox, Boolean> e) {
        extendedLayout.setVisible(e.getValue());
    }
    private void prepare(List<Button> chiffres,Integer i ){
        Button btn =chiffres.get(i);
        btn.setText(i.toString());
        btn.addClickListener(this::addChiffre);
    }

    private void addChiffre(ClickEvent<Button> e){
        String number =ecran.getText();
        ecran.setText(number+e.getSource().getText());

    }
    private void clear() {
        ecran.setText("0");
    }

    private void clear1() {
        ecran.setText("");
    }



}
