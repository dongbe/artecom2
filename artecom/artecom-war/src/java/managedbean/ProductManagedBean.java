/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedbean;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.entity.Craft;
import model.entity.Product;
import model.facade.CraftFacade;
import model.facade.ProductFacade;

/**
 *
 * @author donatien
 */
@ManagedBean(name="productManagedBean")
@SessionScoped
public class ProductManagedBean {
    @EJB
    private ProductFacade productFacade;
    
    @EJB
    private CraftFacade craftFacade;
    
    private List<Craft> crafts;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    private List<Product> products;

    public CraftFacade getCraftFacade() {
        return craftFacade;
    }

    public void setCraftFacade(CraftFacade craftFacade) {
        this.craftFacade = craftFacade;
    }

    public ProductFacade getProductFacade() {
        return productFacade;
    }

    public void setProductFacade(ProductFacade productFacade) {
        this.productFacade = productFacade;
    }
   public List<Product> display(){
       return productFacade.findAll();
   } 
   public List<Craft> getCrafts() {
        crafts = craftFacade.findAll();
        return crafts;
    }
}
