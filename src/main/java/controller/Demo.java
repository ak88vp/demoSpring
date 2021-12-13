package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Demo {
    @GetMapping("")
    public String callName() {
        return "index";
    }

    @GetMapping("/ak88")
    public String callAk88(Model model) {
        model.addAttribute("ak88", "ừ thì anh cx tốt than ôi ....");
        return "ak88";
    }

    @PostMapping("/sum")
    public String getSum(Model model, @RequestParam String a, @RequestParam String b) {
        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        model.addAttribute("sum", "Sum of " + aa + " and " + bb + " is " + (aa + bb));
        return "sum2";
    }

    @GetMapping("/sum")
    public String showSum() {
        return "sum";
    }

    @GetMapping("/money")
    public String showMoney(Model model) {
        return "money";
    }

    @PostMapping("money")
    public String getMoney(Model model, @RequestParam String vnd) {

        int over = Integer.parseInt(vnd);
        model.addAttribute("vnd", vnd);
        model.addAttribute("dola", over * 23000);
        return "money";
    }

    @GetMapping("calculator")
    public String showCalculator() {
        return "calculator";
    }

    @PostMapping("calculator")
    public String getCalculator(Model model, @RequestParam String numberA, String numberB, String result) {

        if (result.equals("Cong")) {
            int a = Integer.parseInt(numberA);
            int b = Integer.parseInt(numberB);
            model.addAttribute("result", a + b);
            model.addAttribute("numberA", a);
            model.addAttribute("numberB", b);

        }
        if (result.equals("tru")) {
            int a = Integer.parseInt(numberA);
            int b = Integer.parseInt(numberB);
            model.addAttribute("result", a - b);
            model.addAttribute("numberA", a);
            model.addAttribute("numberB", b);

        }
        if (result.equals("nhan")) {
            int a = Integer.parseInt(numberA);
            int b = Integer.parseInt(numberB);
            model.addAttribute("result", a * b);
            model.addAttribute("numberA", a);
            model.addAttribute("numberB", b);

        }
        if (result.equals("chia")) {
            int a = Integer.parseInt(numberA);
            int b = Integer.parseInt(numberB);
            model.addAttribute("result", a / b);
            model.addAttribute("numberA", a);
            model.addAttribute("numberB", b);

        }

        return "calculator";
    }

    @GetMapping("magnetism")
    public String showMagnetism(){
        return "magnetism";
    }
    @PostMapping("magnetism")
    public String getMagnetism(Model model,@RequestParam String key){
        Map<String ,String> stringStringMap=new HashMap<>();
        int a=0;
      stringStringMap.put("xin chao","vang khong dam");
      stringStringMap.put("tam biet","cut  me di");
        for (int i = 0; i < stringStringMap.size(); i++) {
            if(stringStringMap.containsKey(key)){
                model.addAttribute("result",stringStringMap.get(key));
                a=1;
            }

        }
        if(a==0){
            model.addAttribute("result","can not find");
        }

        return "magnetism";
    }

}
