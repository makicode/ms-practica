package com.empresa.service.shopping.repository;

import com.empresa.service.shopping.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem, Long> {

}
