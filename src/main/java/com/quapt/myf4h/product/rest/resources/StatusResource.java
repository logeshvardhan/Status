package com.quapt.myf4h.product.rest.resources;

import com.quapt.myf4h.product.domain.Status;
import com.quapt.myf4h.product.repository.StatusRepository;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

@RestController
@RequestMapping("/api/status")
public class StatusResource {

    @Inject
    private StatusRepository statusRepository;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Status> query() {

        List<Status> userStatus = statusRepository.findAll();
        return userStatus;
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Status addItem(@RequestBody Status status) {
        status.setCreatedDate(new Date());
        return statusRepository.save(status);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Status updateStatus(@RequestBody Status updatedStatus, @PathVariable Integer id) {
        return statusRepository.save(updatedStatus);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteItem(@PathVariable Long id) {
        Status status = statusRepository.findOne((Long) id);
        statusRepository.delete(status);
    }
}
