//package com.delta.smallbaazaar.services;
//
//import com.delta.smallbaazaar.datastores.CSVRepo;
//import com.delta.smallbaazaar.entities.CSV;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//import org.springframework.util.StringUtils;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//
//@Service
//public class CSVService {
//
//    private final Path fileStorageLocation;
//
//    @Autowired
//    public CSVService(CSV fileStorageProperties) throws Exception {
//        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
//                .toAbsolutePath().normalize();
//        try {
//            Files.createDirectories(this.fileStorageLocation);
//        } catch (Exception ex) {
//            throw new Exception("Could not create the directory where the uploaded files will be stored.", ex);
//        }
//    }
//
//    public String storeFile(MultipartFile file, Integer supplierId) {
//        String originalFileName = StringUtils.cleanPath(file.getOriginalFilename());
//        String fileName = "";
//
//        try {
//            // Check if the file's name contains invalid characters
//            if(originalFileName.contains("..")) {
//                throw new Exception("Sorry! Filename contains invalid path sequence " + originalFileName);
//            }
//            String fileExtension = "";
//            try {
//                fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
//            } catch(Exception e) {
//                fileExtension = "";
//            }
//            fileName = supplierId + "_" + fileExtension;
//            // Copy file to the target location (Replacing existing file with the same name)
//            Path targetLocation = this.fileStorageLocation.resolve(fileName);
//            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
//            CSV doc = CSVService.checkDocumentByUserId(supplierId);
//            if(doc != null) {
//                doc.setDocumentFormat(file.getContentType());
//                doc.setFileName(fileName);
//                docStorageRepo.save(doc);
//            } else {
//                DocumnentStorageProperties newDoc = new DocumnentStorageProperties();
//                newDoc.setUserId(userId);
//                newDoc.setDocumentFormat(file.getContentType());
//                newDoc.setFileName(fileName);
//                newDoc.setDocumentType(docType);
//                docStorageRepo.save(newDoc);
//            }
//            return fileName;
//        } catch (IOException | Exception ex) {
//            throw new DocumentStorageException("Could not store file " + fileName + ". Please try again!", ex);
//        }
//    }
//
//    private static CSV checkDocumentByUserId(Integer supplierId) {
//    }
//}
