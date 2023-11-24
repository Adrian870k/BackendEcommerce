package com.yod.Ecomerce.controller.SaludoController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yod.Ecomerce.model.Producto;
import com.yod.Ecomerce.service.ProductoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @Value("${spring.application.upload-dir}")
    private String uploadDir;

    @PostMapping("/saveProduct")
    public Producto guardarProducto(@RequestBody Producto producto) throws IOException {
        if (producto.getImagenPath() != null && !producto.getImagenPath().isEmpty()) {
            byte[] decodedImage = Base64.getDecoder().decode(producto.getImagenPath().split(",")[1]);
            // Save image to directory
            String imageName = "product_" + System.currentTimeMillis() + ".jpg";
            String imagePath = saveImageToFileSystem(decodedImage, imageName);
            producto.setImagenPath(imagePath);
        }
        return productoService.guardarProducto(producto);
    }

    @GetMapping("/findProducts")
    public List<Producto> findProducts() {
        return productoService.findAllProductos();
    }

    @PostMapping("/findProductById")
    public Producto findProductoById(@RequestParam Long id) {
        return productoService.findProductoById(id);
    }

    private String saveImageToFileSystem(byte[] imageBytes, String imageName) throws IOException {
        Path imagePath = Paths.get(uploadDir, imageName);
        Files.write(imagePath, imageBytes);
        return imagePath.toString();
    }

}
