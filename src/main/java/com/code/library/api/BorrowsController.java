package com.code.library.api;

import com.code.library.domain.Borrows;
import com.code.library.dto.BorrowRequest;
import com.code.library.repository.SampleRepository;
import com.code.library.repository.StudentRepository;
import com.code.library.service.BorrowsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/borrows")
@CrossOrigin
public class BorrowsController {

    private final BorrowsService borrowsService;
    private final StudentRepository studentRepository;
    private final SampleRepository sampleRepository;

    public BorrowsController(BorrowsService borrowsService, StudentRepository studentRepository, SampleRepository sampleRepository) {
        this.borrowsService = borrowsService;
        this.studentRepository = studentRepository;
        this.sampleRepository = sampleRepository;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBorrow(@PathVariable Long id) {
        borrowsService.delete(id);

        return new ResponseEntity<String>("Borrow was deleted", HttpStatus.OK);
    }

    @GetMapping(value="/allBorrows")
    public List<Borrows> getAllBorrows(){
        return borrowsService.getAllBorrows();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/post")
    public void addStudentWithBook(@RequestBody BorrowRequest borrowRequest){
        borrowsService.addBorrow(borrowRequest);
    }


}
