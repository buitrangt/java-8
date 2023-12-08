# Mô Hình Phương Tiện Giao Thông

## Mục Đích Dự Án

Dự án này nhằm tạo ra một mô hình phương tiện giao thông đơn giản và mở rộng, cho phép tích hợp các loại phương tiện mới mà không làm ảnh hưởng đến cấu trúc chung. Các lớp và phương thức được thiết kế để tăng tính tái sử dụng và làm cho mã nguồn dễ hiểu.

## Lựa Chọn Thiết Kế

### 1. **Lớp Trừu Tượng `Vehicle`**

- **Lợi Ích:**
  - Đại diện cho các đặc điểm chung của mọi loại phương tiện.
  - Tăng tính linh hoạt và giảm mã lặp.

- **Triển Khai:**
  - Các thuộc tính chung như tốc độ (`speed`) và sức chứa (`capacity`) được đặt ở lớp trừu tượng.
  - Constructor chung giúp khởi tạo các thuộc tính chung khi tạo đối tượng.

### 2. **Giao Diện `Moveable`**

- **Lợi Ích:**
  - Bảo đảm rằng mọi loại phương tiện đều có khả năng di chuyển.

- **Triển Khai:**
  - Phương thức `move()` đảm bảo rằng mỗi phương tiện đều có khả năng di chuyển, tăng tính tái sử dụng.

### 3. **Lớp Cụ Thể (`Car`, `Bicycle`, `Truck`, `Boat`)**

- **Lợi Ích:**
  - Tính kế thừa giúp sử dụng lại mã nguồn và giảm độ phức tạp.

- **Triển Khai:**
  - Mỗi lớp cụ thể triển khai các đặc điểm riêng của loại phương tiện đó.
  - Phương thức `displayUniqueFeatures()` hiển thị các đặc điểm độc đáo.

## Hướng Dẫn Sử Dụng

1. **Chạy Mô Hình:**
   - Chạy `Main.java` để xem kết quả của mô hình.
  
