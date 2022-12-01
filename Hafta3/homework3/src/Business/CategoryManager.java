package Business;

import AccessDatabase.CategoryDao;
import Enitity.Category;


public class CategoryManager implements CategoryDao {

    @Override
    public void add(Category category) throws Exception {

        if (!category.getCategoryName().equalsIgnoreCase("Programlama")) {
            throw new Exception(category.getCategoryName() + " diye bir kategori bulunamadı. Yeniden seçin.");
        } else {
            System.out.println("Kategori Seçildi." + category.getCategoryName().substring(0, 1).toUpperCase() + category.getCategoryName().substring(1).toLowerCase());

        }

    }
}
