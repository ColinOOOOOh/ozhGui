/* 
 * File:   frame.hpp
 * Author: Wen, Chifeng <https://sourceforge.net/u/daviesx/profile/>
 *
 * Created on February 5, 2015, 11:17 AM
 */

#ifndef FRAME_HPP
#define	FRAME_HPP

#include <string>

namespace ozh {
namespace api {

class Container;

/**
 * Create a ozh window frame.
 */
class Frame {
public:
	const static int Style_Title = 1 << 1;
	const static int Style_FullScreen = 1 << 2;
	const static int Style_MenuBar = 1 << 3;

	Frame();
	Frame(int style);
	Frame(int style, std::string title);

	void set_visible(bool val);
	void set_size(int width, int height);
	void set_content_pane(Container* pane);
	void set_title(std::string title);

	int get_width();
	int get_height();
	Container* get_content_pane();
	std::string get_title();
};

}
}

#endif	/* FRAME_HPP */

