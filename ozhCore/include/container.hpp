/* 
 * File:   container.hpp
 * Author: Wen, Chifeng <https://sourceforge.net/u/daviesx/profile/>
 *
 * Created on February 5, 2015, 11:24 AM
 */

#ifndef CONTAINER_HPP
#define	CONTAINER_HPP

namespace ozh {

class Component;

/**
 * Other ozh components are added into this container as a list.
 */
class Container {
public:
        Container();

        void add(Component* component);

        Component* get_first();
        Component* get_next();
        bool has_next();
};

};

#endif	/* CONTAINER_HPP */

