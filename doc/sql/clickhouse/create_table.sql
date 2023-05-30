create table test_clickhouse
(
    Id          Int32 comment '主键',
    name Nullable(varchar(50)) comment '名称',
    create_time date comment '创建时间',
    update_time date comment '更新时间',
    del_remark  smallint comment '删除标记'
)
    ENGINE = MergeTree()
ORDER BY update_time;
