`Group Id` : Tên tổ chức / công ty / cá nhân của dự án

`Artifact Id` : Tên của packge, dự án

`đảo ngược tên miền`: 

`SpringBoot có 2 cơ chế để quản lý thư viện` : 

`pom.xml`  : nơi chứa các thông tin của dự án (tên dự án, version, nhóm phát triển, các thư viện được sử dụng, các plugins…)

`dependency` : khai báo các thư viện (tên + version)

`@Controller` **HTM** L nơi tiếp nhận request và trả về response cho client

`@RestController` **TEXT** được kết hợp bởi @Controller và @ResponseBody giúp cho việc xây dựng các RESTful API được dễ dàng hơn

`@RequestMapping` map request với class hoặc method xử lý request đó. _(value, method, params)_

`@ResponseBody` **TEXT** được thêm vào trước các method của các controller để chỉ dẫn rằng method này sẽ trả về text thay vì trả về view.

`@RequestBody`   ánh xạ HttpRequest body sang một domain object tự động.

` @RequestParam` được dùng để trích xuất dữ liệu từ request query. `@PathVariable` thì được dùng để trích xuất dữ liệu từ URL path.

`@PathVariable` đơn giản nhất là dùng để xác thực khóa chính của entity muốn truy vấn.

`@PathVariable` không thể hoán đổi Thứ tự các thành phần đường dẫn

`@GetMapping` dùng để bắt các HTTP GET method, `@PostMapping` bắt các POST request

`@Value` annotation được sử dụng để chú thích các thuộc tính trong class hoặc các tham số đầu vào của method hay constructor để đặt tiêm các giá trị tương ứng được cấu hình trong các tệp cấu hình, ngoài ra nó còn được sử dụng để đặt giá trị mặc định cho các thuộc tính hoặc tham số đầu vào của method, constructor.

`@Service` Đánh dấu một Class là tầng Service, phục vụ các logic nghiệp vụ.

`@Repository` Đánh dấu một Class Là tầng Repository, phục vụ truy xuất dữ liệu.

`th:text` đổ text **thuần** không thẻ HTML vào view template

`th:utext` đổ text có thẻ HTML, CSS vào view template


${...}: biểu thức thay giá trị của biến vào template
*{...}: biểu thức thay thuộc tính của biến vào template. Hay dùng với form post
#{...}: message expression, biểu thức thay chuỗi đa ngôn ngữ từ file resource.
@{...}: link expression, biểu thức liên kết
~{...}: fragement expression, biểu thức mảnh

Giải thích: "${...}" để đánh dấu biểu thức thay biến vào chỗ trống.
"${person.name + ' : ' + person.nationality}" biểu thức cộng 2 hai biến
"${person.name} + ' : ' + ${person.nationality}" cộng hai biểu thức
"|${person.name} : ${person.nationality}|" cú pháp thay thế biến. Chú ý hai ký tự pipe | ở hai đầu
<div th:utext="${message}"></div> thì chuyên xuất chuỗi chứa thẻ HTML, CSS
th:text="${person}" xuất ra cả person.toString()


`th:fragment` để định nghĩa một mảnh HTML cần tái sử dụng nhiều lần
`th:insert` để chèn một mảnh HTML định nghĩa trước đó vào trong thẻ hiện tại
`th:replace` để thay thế một mảnh HTML định nghĩa trước đó cho thẻ hiện tại
`th:action` viết biểu thức đường dẫn mà Form sẽ gửi lên server. Nó khác thuộc tính action vốn có của Form ở chỗ, bạn có thể viết biểu thức, biến, so sánh, điều       kiện…để động hoá đường dẫn.
`th:object` khai báo đối tượng chứa dữ liệu các trường để điền vào form.
`th:field` lấy dữ liệu trong từng thuộc tính của đối tượng đổ vào một trường text.

<a th:href="@{/about}">Abosolute Link</a><br>
<a th:href="@{~/topic/thymeleaf}">Relative link 1</a><br>
<a th:href="@{topic/thymeleaf}">Relative link 2</a><br>
<a th:href="@{/about(foo='bar',tom='jerry')}">Query string parameters</a><br>
<a th:href="|/${dynamiclink}|">dynamic link 1</a><br>
<a th:href="@{${dynamiclink}}">dynamic link 2</a><br>
<a th:href="@{/page/(id=${dynamiclink})}">dynamic link 3</a><br>
