// package com.techmaster.demo.controller;

// import com.techmaster.demo.model.Student;
// import java.util.List;
// import java.util.Random;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// // import org.apache.logging.log4j.message.Message;
// // import org.springframework.http.MediaType;
// import org.springframework.web.bind.annotation.GetMapping;
// // import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseBody;
// // import org.springframework.web.bind.annotation.RequestParam;
// // import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class HelloController {

//   @RequestMapping("/")
//   String hello() {
//     return "Hello World, Spring Boot!";
//   }

//   //     @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
//   //     public Book book() {
//   //    return new Book("x111", "Dế Mèn Phiêu Lưu Ký", "Tô Hoài");
//   // }

//   // @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
//   // public Book book_xml() {
//   //   return new Book("x111", "Dế Mèn Phiêu", "Tô Hoài");
//   // }

//   // @GetMapping("/add/{a}/{b}")
//   // public int add(@PathVariable("a") int a, @PathVariable("b") int b) {
//   //   return a + b;
//   // }

//   // @GetMapping("/name/{your_name}")
//   // public String hello(@PathVariable("your_name") String yourName) {
//   //   return "Hello " + yourName;
//   // }

//   // @GetMapping("/add")
//   // public int add2(@RequestParam("a") int a, @RequestParam("b") int b) {
//   //   return a + b;
//   // }

//   @GetMapping("/random")
//   public String random() {
//     String result = "";
//     String UPPER = "QWERTYUIOPASDFGHJKLZXCVBNM";
//     String RANDOM = UPPER + "1234567890" + UPPER.toLowerCase();

//     for (int i = 0; i <= 8; i++) {
//       int temp = (int) Math.round(Math.random() * RANDOM.length());
//       result += RANDOM.charAt(temp);
//     }
//     return result;
//   }

//   @GetMapping("/quote")
//   public String quote() {
//     String[] str = {
//       "Kiến tha lâu đầy tổ",
//       "Có công mài sắt, có ngày nên kim",
//       "Không thầy đố mày làm nên",
//       "Học thầy không tày học bạn",
//     };
//     Random random = new Random();
//     int num = random.nextInt(4);
//     return str[num];
//   }

//   @PostMapping("/bmi")
//   @ResponseBody
//   public double bmi(@RequestParam Double h, @RequestParam Double w) {
//     return h / (w * 2);
//   }
//   // @RestController
//   // @RequestMapping(path = "/student")
//   // public class studenController{
//   //   @GetMapping("")
//   //   List<Student> getAllStudent(){
//   //     return List.of(new Student(1, "abc"));
//   //   }
//   // }

// }
//     int num = random.nextInt(4);
//     return str[num];
//   }

//   @PostMapping("/bmi")
//   @ResponseBody
//   public double bmi(@RequestParam Double h,@RequestParam Double w) {
//     return h / (w * 2);
//   }

//   // @RestController
//   // @RequestMapping(path = "/student")
//   // public class studenController{
//   //   @GetMapping("")
//   //   List<Student> getAllStudent(){
//   //     return List.of(new Student(1, "abc"));
//   //   }
//   // }

// }
