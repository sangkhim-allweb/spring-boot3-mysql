package com.sangkhim.spring_boot3_mysql.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class PageUtils {

  public static Pageable pageable(int page, int pageSize, String sortField, String sortDirection) {
    if (page == 0) {
      return Pageable.unpaged();
    }
    return PageRequest.of(
        page - 1, pageSize, Sort.by(Sort.Direction.fromString(sortDirection), sortField));
  }
}
