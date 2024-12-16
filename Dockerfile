# Use a more recent and stable version of NGINX
FROM nginx:latest

# Install the latest versions of wget and curl
RUN apt-get update && apt-get install -y wget curl \
    && apt-get clean

# Remove sensitive information from the image
# (Do not hardcode passwords or secrets)

# Copy a basic index.html file
COPY index.html /usr/share/nginx/html/index.html

# Expose port 80
EXPOSE 80

# Start the NGINX server
CMD ["nginx", "-g", "daemon off;"]
