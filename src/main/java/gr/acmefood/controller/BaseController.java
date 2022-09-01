//package gr.acmefood.controller;
//
//import gr.acmefood.domain.BaseModel;
//import gr.acmefood.transfer.ApiResponse;
//import org.springframework.http.ResponseEntity;
//
//import java.util.List;
//
//public interface BaseController<T extends BaseModel> {
//
//    ResponseEntity<ApiResponse<T>> create(final T entity);
//
//    ResponseEntity<ApiResponse<List<T>>> createAll(final List<T> entities);
//
//    void update(T entity);
//
//    void deleteById(Long id);
//
//
//    ResponseEntity<ApiResponse<T>> get(Long id);
//
//   ResponseEntity<ApiResponse<List<T>>> findAll();
//}
