package com.example.atmtestapp;

import com.example.atmtestapp.repository.AccountRepository;
import com.example.atmtestapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Binding;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class MainController {
    @Autowired
    AccountRepository accountRepo;

    @Autowired
    TransactionRepository transactionRepo;

    @RequestMapping("/")
    public String showIndex(Model model){
        model.addAttribute("anAccount", new Account());
        model.addAttribute("accountNumbers", accountRepo.findAll());
        return "index";
    }

    @RequestMapping("/newaccount")
    public String addNewAccount(Model model) {
        model.addAttribute("anAccount", new Account());
        return "accountform";
    }

    @PostMapping("/saveaccount")
    public String saveAccount(@Valid @ModelAttribute("anAccount") Account account, BindingResult result){
        if(result.hasErrors()){
            return "index";
        }
        accountRepo.save(account);
        return "redirect:/";
    }

/*    @RequestMapping("/deposit")
    public String makeDeposit(HttpServletRequest request, Model model){
        long id = new Long(request.getParameter("id"));
        model.addAttribute("anAccount",accountRepo.findById(id).get());
        return"depositform";
    }

    @RequestMapping("/withdrawal")
    public String makeWithdrawal(HttpServletRequest request, Model model){
        long id = new Long(request.getParameter("id"));
        model.addAttribute("anAccount",accountRepo.findById(id).get());
        return"withdrawalform";
    }*/


}
