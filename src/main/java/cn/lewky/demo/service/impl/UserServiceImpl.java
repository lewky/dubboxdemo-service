// Copyright (c) 2018-2018 Lewis.Liu Limited. All rights reserved.
// Contact with me on Github - https://github.com/lewky
// ============================================================================
// CURRENT VERSION dubboxdemo-service.1.0.0
// ============================================================================
// CHANGE LOG
// dubboxdemo-service.1.0.0 : 2018-10-01, Lewis.Liu created
// ============================================================================
package cn.lewky.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import cn.lewky.demo.service.UserService;

/**
 * @author Lewis.Liu
 *
 */
@Service
public class UserServiceImpl implements UserService {

    /* (non-Javadoc)
     * @see cn.lewky.demo.service.UserService#getName()
     */
    @Override
    public String getName() {

        return "lewky";
    }

}
