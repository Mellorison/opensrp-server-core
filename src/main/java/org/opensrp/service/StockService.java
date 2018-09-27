package org.opensrp.service;

import java.util.List;

import org.joda.time.DateTime;
import org.opensrp.domain.Stock;
import org.opensrp.repository.StocksRepository;
import org.opensrp.search.StockSearchBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {
	
	private final StocksRepository allStocks;
	
	@Autowired
	public StockService(StocksRepository allStocks) {
		this.allStocks = allStocks;
	}
	
	public List<Stock> findAllByProviderid(String providerid) {
		return allStocks.findAllByProviderid(providerid);
	}
	
	public Stock getById(String id) {
		return allStocks.findById(id);
	}
	
	public List<Stock> getAll() {
		return allStocks.getAll();
	}
	
	public List<Stock> findStocks(StockSearchBean searchBean, String sortBy, String sortOrder, int limit) {
		return allStocks.findStocks(searchBean, sortBy, sortOrder, limit);
	}
	
	public List<Stock> findStocks(StockSearchBean searchBean) {
		return allStocks.findStocks(searchBean);
	}
	
	public List<Stock> findAllStocks() {
		return allStocks.findAllStocks();
	}
	
	public Stock find(Stock stock) {
		Stock st = allStocks.findById(stock.getId());
		if (st == null) {
			return null;
		} else {
			return stock;
		}
	}
	
	public synchronized Stock addStock(Stock stock) {
		Stock st = find(stock);
		if (st != null) {
			throw new IllegalArgumentException(
			        "A stock already exists with given id. Consider updating data.[" + st.getId() + "]");
		}
		allStocks.add(stock);
		return stock;
	}
	
	public synchronized Stock addorUpdateStock(Stock stock) {
		if (stock.getId() != null && getById(stock.getId()) != null) {
			stock.setDateEdited(DateTime.now());
			stock.setServerVersion(null);
			stock.setRevision(getById(stock.getId()).getRevision());
			allStocks.update(stock);
		} else {
			stock.setDateCreated(DateTime.now());
			allStocks.add(stock);
		}
		return stock;
	}
	
	public void updateStock(Stock updatedStock) {
		// If update is on original entity
		if (updatedStock.isNew()) {
			throw new IllegalArgumentException(
			        "Stock to be updated is not an existing and persisting domain object. Update database object instead of new pojo");
		}
		
		updatedStock.setDateEdited(DateTime.now());
		
		allStocks.update(updatedStock);
	}
	
	public Stock find(String uniqueId) {
		List<Stock> sList = allStocks.findAllByProviderid(uniqueId);
		if (sList.size() > 1) {
			throw new IllegalArgumentException("Multiple events with identifier " + uniqueId + " exist.");
		} else if (sList.size() != 0) {
			return sList.get(0);
		}
		return null;
	}
	
	public Stock mergeStock(Stock updatedStock) {
		Stock original = find(updatedStock);
		if (original == null) {
			throw new IllegalArgumentException("No stock found with given id. Consider adding new!");
		}
		original.setDateEdited(DateTime.now());
		allStocks.update(original);
		return original;
	}
	
	public List<Stock> findStocksBy(StockSearchBean searchBean) {
		return allStocks.findStocks(searchBean);
	}
	
}
