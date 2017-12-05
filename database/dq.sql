create table `product_info`(
	`product_id` varchar(32) not null,
    `product_name` varchar(64) not null comment '农产品名称',
    `product_price` decimal(8,2) not null comment '单价',
    `product_stock` int not null comment '数量',
    `product_description` varchar(64) comment '描述',
    `product_type` varchar(64) comment '品种',
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    
    primary key (`product_id`)
) comment '农产品表';