import {Sequelize} from 'sequelize-typescript';
import { Member } from '@models/member';
import { Paths } from '@models/paths';
import { UserInfo } from '@models/UserInfo';

export const sequelize = new Sequelize({
    database : process.env.MYSQL_DATABASE,
    dialect : 'mysql',
    username : "ehdrms2034",
    password : "kk940501",
    host : process.env.MYSQL_HOST,
    // logging : false
});

sequelize.addModels([Member,Paths,UserInfo]);

sequelize.sync();