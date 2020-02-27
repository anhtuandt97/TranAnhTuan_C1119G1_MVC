package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@SessionAttributes(names = {"myCart"})
public class ProductController {
    @Autowired
    private ProductService productService;

    @ModelAttribute("myCart")
    public Cart setUpCart(){
        return new Cart();
    }


    @GetMapping("/product")
    public ModelAndView ShowProduct(){
        ModelAndView modelAndView = new ModelAndView("list" );
        modelAndView.addObject("listProduct", productService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
public ModelAndView createProduct(){
        ModelAndView modelAndView = new ModelAndView("create","product",new Product());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView addProduct(@ModelAttribute("product") Product product){
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("product", product);
        modelAndView.addObject("message", "add successfully");
        return modelAndView;
    }

    @GetMapping("/edit/{idProduct}")
    public ModelAndView editProduct(@PathVariable Long idProduct){
        Product product = productService.findById(idProduct);
        if (product == null){
            return new ModelAndView("create", "message", "not found");
        }
        else {
            ModelAndView modelAndView = new ModelAndView("edit");
            modelAndView.addObject("product", product);
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public ModelAndView updateProduct(@ModelAttribute("product") Product product){
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("product", product);
        modelAndView.addObject("message", "add successfully");
        return modelAndView;
    }

    @GetMapping("/delete/{idProduct}")
    public ModelAndView deleteProduct(@PathVariable Long idProduct){
        Product product = productService.findById(idProduct);
        if (product == null){
            return new ModelAndView("create", "message", "not found");
        }
        else {
            ModelAndView modelAndView = new ModelAndView("delete");
            modelAndView.addObject("product", product);
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public String deleteProduct(@ModelAttribute("product") Product product){
        productService.remove(product.getIdProduct());
        return "redirect:product";
    }
    @GetMapping("/view/{idProduct}")
    public ModelAndView viewProduct(@PathVariable Long idProduct){
        Product product = productService.findById(idProduct);
        if (product == null){
            return new ModelAndView("create", "message", "not found");
        }
        else {
            ModelAndView modelAndView = new ModelAndView("view");
            modelAndView.addObject("product", product);
            return modelAndView;
        }
    }

@GetMapping("/viewCart")
public ModelAndView viewCart(){
        return new ModelAndView("viewCart");
}

    @GetMapping("/remove/{idProduct}")
    public ModelAndView removeProduct(@ModelAttribute("Cart") Cart cart, @PathVariable("idProduct") Long idProduct){
        Product product = productService.findById(idProduct);
        cart.deleteProduct(product);
        ModelAndView modelAndView = new ModelAndView("viewCart");
        return modelAndView;
    }
    @GetMapping("/addProduct/{idProduct}")
    public String addProduct(@ModelAttribute("myCart") Cart cart,@PathVariable("idProduct") Long idProduct){
        Product product = productService.findById(idProduct);
        cart.addProduct(product);
        return "viewCart";
    }
}
