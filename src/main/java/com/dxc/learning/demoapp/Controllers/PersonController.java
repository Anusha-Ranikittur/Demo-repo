package com.dxc.learning.demoapp.Controllers;

import java.time.LocalDate;

import com.dxc.learning.demoapp.services.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {


    @Autowired
    private PersonService personService;

    @Autowired
    private ModelMapper modelMapper;


    @GetMapping("/person")
    public ResponseEntity<List<Person>> getAllPersons(){
        return ResponseEntity.status(HttpStatus.OK).body(persons);
    }
    
    @PostMapping("/pesron")
    public Person createPerson(@RequestBody Person newPerson){
        person.setCreationDate(LocalDate.now());
        return personService.createPerson(newPerson);
    }

    @GetMapping("/person/{id}")
    public Person getpersonById(@PathVariable int id) {
        return personService.getPersonById(id);
    }

    @PutMapping("/person/{id}")
   public Person updatePerson(@RequestBody Person person, @PathVariable Integer id) {  
    return personService.updatePerson(person);
   }

   @DeleteMapping("/person/{id}")
  public void deletePerson(@PathVariable Integer id) {
    personService.deletePerson(id);
}
