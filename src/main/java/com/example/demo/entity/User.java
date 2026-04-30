package com.example.demo.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "`user`")  // ← 加反引号！user是MySQL保留字
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;

    @CreationTimestamp
    @Column(name="create_time",length = 50)
    private LocalDateTime createtime;

    // ← 之前完全没有 Setter！Hibernate 无法写入数据
    public void setId(Long id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setEmail(String email) { this.email = email; }
    public void setCreatetime(LocalDateTime createtime){this.createtime=createtime;}

    // Getter 保持不变
    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
    public LocalDateTime getCreatetime(){ return createtime; } }

