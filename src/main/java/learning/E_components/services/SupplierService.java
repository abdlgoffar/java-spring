package learning.E_components.services;

import learning.E_components.repositories.SupplierRepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class SupplierService {
    private List<SupplierRepository> supplierRepositories;

    //contoh cara inject component lebih dari satu data dengan type data yang sama menggunakan ObjectProvider<T>.
    @Autowired
    public SupplierService(ObjectProvider<SupplierRepository> supplierRepositories) {
        List<SupplierRepository> collect = supplierRepositories.stream().collect(Collectors.toList());
        this.supplierRepositories = collect;
    }

    public List<SupplierRepository> getSupplierRepositories() {
        return supplierRepositories;
    }
}
