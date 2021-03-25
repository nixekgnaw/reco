CREATE TABLE `recodb`.`User`  (
                                      `id` int NOT NULL,
                                      `create_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
                                      `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
                                      `telephone` varchar(40) NOT NULL DEFAULT '',
                                      `password` varchar(200) NOT NULL DEFAULT '',
                                      `nick_name` varchar(40) NOT NULL DEFAULT '',
                                      `gender` int NOT NULL DEFAULT 0,
                                      PRIMARY KEY (`id`),
                                      UNIQUE INDEX `telephone_unique_index`(`telephone`) USING BTREE
);