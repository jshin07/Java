package com.jenny.productscatagories.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jenny.productscatagories.models.Category;
import com.jenny.productscatagories.models.Product;
import com.jenny.productscatagories.services.CategoryService;
import com.jenny.productscatagories.services.ProductService;

@Controller
@RequestMapping("/")
public class ProductController {
	private ProductService productService;
	private CategoryService categoryService;
	
	public ProductController(ProductService productService, CategoryService categoryService){
		this.productService= productService;
		this.categoryService= categoryService;
	}
	
	@RequestMapping("products/new")
	public String newproduct(@ModelAttribute("product") Product product){
		return "newproduct.jsp";
	}

//TO ADD PRODUCT
	@PostMapping("products/new")
	public String newproduct(@Valid @ModelAttribute("product") Product product, BindingResult result, RedirectAttributes flash){
		if(result.hasErrors()){
			flash.addFlashAttribute("errs", result.getAllErrors());
			return "redirect:/products/new";
		}else{
			productService.create(product);		
			return "redirect:/products/"+product.getId();
		}
	}

	@RequestMapping("products/{id}")
	public String product(@ModelAttribute("category") Category category, @PathVariable("id") Long id, Model model){
		model.addAttribute("categories", (ArrayList<Category>) categoryService.all());
		Product product=productService.findById(id);
		
		model.addAttribute("products", product);
		return "products.jsp";
	}	
	
//TO ADD CATEGORY TO A PRODUCT -- PRODUCTS.JSP
	@PostMapping("products/{id}")
	public String addCategory(@Valid @ModelAttribute("category") Category category, @PathVariable("id")Long id,  BindingResult result){

		System.out.println(id);		
		String categoryId= (String) result.getFieldValue("name");
		System.out.println(categoryId);

		Product itsProduct = productService.findById(id);		
		Category itsCategory= categoryService.findById(Long.parseLong(categoryId.trim()));
		

		List <Category> list= itsProduct.getCategories();
		list.add(itsCategory);
		itsProduct.setCategories(list);
		productService.create(itsProduct);
		

		return "redirect:/products/" + id;
	}
	

/////////////////// NEW CATEGORY PAGE //////////////////////////
	@RequestMapping("categories/new")
	public String newCategory(@ModelAttribute("category") Category category){
		return "newcategory.jsp";
	}
	
	
// ADD NEW CATEGORY --NEWCATEGORY.JSP
	@PostMapping("categories/new")
	public String newCategory(@Valid @ModelAttribute("category") Category category, BindingResult result, RedirectAttributes flash){
		if(result.hasErrors()){
			flash.addFlashAttribute("errs", result.getAllErrors());
			return "redirect:/categories/new";
		}else{
			categoryService.create(category);		
			return "redirect:/categories/"+category.getId();
		}
	}
	
	@RequestMapping("categories/{id}")
	public String category(@ModelAttribute("product") Product product, @PathVariable("id") Long id, Model model){
		model.addAttribute("products", (ArrayList<Product>) productService.all());
		Category category= categoryService.findById(id);
		model.addAttribute("categories", category);
		
		return "categories.jsp";
	}

	
// TO ADD PRODUCTS TO CATEGORY -- CATEGORIES.JSP
	@PostMapping("categories/{id}")
	public String addProduct(@Valid @ModelAttribute("product") Product product, @PathVariable("id")Long id, BindingResult result){
		String productId= (String) result.getFieldValue("name");
		Product itsProduct = productService.findById(Long.parseLong(productId.trim()));
		Category itsCategory= categoryService.findById(id);
		List<Product> list = itsCategory.getProducts();
		list.add(itsProduct);
		itsCategory.setProducts(list);
		categoryService.create(itsCategory);
		
		return "redirect:/categories/"+ id;
		
	}
	
	
}
