package br.com.erlds.aws_project1.repository;

import br.com.erlds.aws_project1.model.Invoice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface InvoiceRepository extends CrudRepository<Invoice,Long> {
    Optional<Invoice> findByInvoiceNumber(Long invoiceNumber);

    List<Invoice> findAllByCustomerName(String customerName);
}
